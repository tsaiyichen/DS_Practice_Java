package CH3;

import java.util.*;

public class Stack_permutation {
    public static int count = 0;
    public static void generateStackPermutations(int n) {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            input.add(i);
        }
        List<Integer> output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        generatePermutations(input, output, stack);
    }
    private static void generatePermutations(List<Integer> input, List<Integer> output, Stack<Integer> stack) {
        if (input.isEmpty() && stack.isEmpty()) {
            count++;
            System.out.println(output);
            return;
        }


        if (!input.isEmpty()) {
            int element = input.remove(0);
            stack.push(element);
            generatePermutations(input, output, stack);
            stack.pop();
            input.add(0, element);
        }


        if (!stack.isEmpty()) {
            int element = stack.pop();
            output.add(element);
            generatePermutations(input, output, stack);
            output.remove(output.size() - 1);
            stack.push(element);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        generateStackPermutations(n);
        System.out.println("number of stack permutations: " + count);
    }
}

