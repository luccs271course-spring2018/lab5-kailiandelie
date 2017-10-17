package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order

    LinkedStack<String> stack = new LinkedStack<String>();
    String line;
    final Scanner input = new Scanner(System.in);

    while (input.hasNextLine()) {

      line = input.nextLine();
      stack.push(line);
      if (line == "") {
        break;
      }
    }

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
