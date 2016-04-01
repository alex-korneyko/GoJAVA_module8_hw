package ua.goit.gojava;

import ua.goit.gojava.Files.Directory;
import ua.goit.gojava.Files.Sort;
import ua.goit.gojava.View.ShowDirectory;

public class Main {
    public static void main(String[] args) {

        //Создание директории. Указывается имя директории и количество файлов в ней
        //Файл будут создаваться случайным образом, параметры файлов тоже случайные

        Directory directory1 = new Directory("First", 5);

        //Показать содержимое директории через встроенные методы toString
        //Задаётся имя директории
        ShowDirectory.asLines(directory1);

        //Показать содержимое директории в виде таблицы.
        //Задаётся имя директории и ширина столбцов
        //Была мысль сделать автоподбор ширины, но не хватило времени
        System.out.println("Unsorted.");
        ShowDirectory.asTable(directory1, 18);

        //Сортировка файлов в директории по имени
        System.out.println("Sort by name.");
        Sort.byName(directory1);

        //Вывод в виде таблицы
        ShowDirectory.asTable(directory1, 18);

        //Сортировка файлов в директории по размеру
        System.out.println("Sort by size.");
        Sort.bySize(directory1);

        //Вывод в виде таблицы
        ShowDirectory.asTable(directory1, 18);
    }
}

