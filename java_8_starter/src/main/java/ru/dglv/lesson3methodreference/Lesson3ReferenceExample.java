package ru.dglv.lesson3methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface MethodRef {
    void methodref();
}

class Printer {
    private final String model;

    public Printer() {
        this.model = "Unknown";
    }

    public Printer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void print() {
        Supplier<String> message = () -> "Printer " + model + " is printing...";
        System.out.println(message.get());
    }

    public static void output(String input) {
        System.out.println(input);
    }

}

public class Lesson3ReferenceExample {
    public static void main(String... args) {
        List<String> models = Arrays.asList("HP", "Canon", "Epson", "Samsung");


        List<Printer> printers = models.stream()
                // Constructor reference
                .map(Printer::new)
                // Class method reference
                .sorted(Comparator.comparing(Printer::getModel))
                .collect(Collectors.toCollection(LinkedList::new));

        printers.stream()
                .forEach(printer -> System.out.println(printer.getModel()));

        // Constructor reference
        Supplier<Printer> constructor = Printer::new;
        // Static method reference
        Consumer<String> staticMethod = Printer::output;

        Printer printer = constructor.get();
        // Object method reference
        MethodRef objectMethod = printer::print;

        staticMethod.accept("print me now!");
        objectMethod.methodref();
    }
}