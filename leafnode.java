package assignments;

import java.util.Scanner;

public class leafnode {
	public static class Node {
		int key;
		Node left, right;

		Node(int d) {
			key = d;
			left = right = null;
		}
	}

	static Node root;

	public leafnode() {
		root = null;
	}

	public static void insert1(int key) {
		root = insert(root, key);
	}

	public static Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else if (key < root.key) {
			root.left = insert(root.left, key);
		} else if (key > root.key) {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public static void printl(Node root) {
		if (root == null) {
			return;
		} else if (root.left == null && root.right == null) {
			System.out.println(root.key + " ");
		} else {
			printl(root.left);
			printl(root.right);
		}
	}

	public static void main(String arg[]) {
		leafnode bt = new leafnode();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of data");
		int n = sc.nextInt();
		System.out.println("enter the data Elements");
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			insert1(d);
		}
	}

}
