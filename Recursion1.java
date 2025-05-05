//factorial
public int factorial(int n) {
  if (n == 0)
  {
    return 1;
  }
  return n * factorial(n-1);
}

//bunnyEars
public int bunnyEars(int bunnies) {
  if(bunnies == 0)
  {
    return 0;
  }
  return 2 + (bunnyEars(bunnies - 1));
}

//fibinacci 
public int fibonacci(int n) {
  if(n == 0)
  {
    return 0;
  }
  if(n ==1)
  {
    return 1;
  }
  return fibonacci(n-1) + fibonacci(n-2);
}
