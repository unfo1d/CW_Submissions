//Task 1: makeOutWord

public String makeOutWord(String out, String word) {
  String putInside = (out.substring(0,2) + word + out.substring(2,out.length()));
  return putInside;
}

// Task 2: extraEnd

public String extraEnd(String str) {
  String lastTwo = str.substring(str.length()-2);
  return lastTwo + lastTwo +lastTwo;
}

//Task 3: firstTWo

public String firstTwo(String str) {
  if (str.length() < 2)
  {
    return str;
  }
  else
  {
    return str.substring(0,2);
  }
}

// Task 4: withoutEnd
public String withoutEnd(String str) {
    String withoutEnd = str.substring(1,str.length()-1);
    return withoutEnd;
}
