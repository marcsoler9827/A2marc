package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (option) {
                case 1:
                    // Logic for adding a new task
                    System.out.println("Escribe la descripción de la tarea:");
                    String description = scanner.nextLine();
                    Task newTask = new Task(description);
                    tasks.add(newTask);
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    // Logic for marking task as complete
                    System.out.println("Escribe el número de la tarea para marcar como completada:");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.get(taskNumber - 1).setCompleted(true);
                        System.out.println("Tarea marcada como completada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 3:
                    // Logic for showing tasks
                    System.out.println("Lista de tareas:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }
        }
    }
}
