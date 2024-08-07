int[] arr = {1, 2, 3, 4, 5};
int max = IntStream.of(arr).max().getAsInt();
System.out.println("Max value is " + max);
