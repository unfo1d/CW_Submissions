//alarmClock
public String alarmClock(int day, boolean vacation) {
  if (vacation == true)
  {
    if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
    {
      return "10:00";
    }
    else
    {
      return "off";
    }
  }
  if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
  {
    return "7:00";
  }
  else 
  {
    return "10:00";
  }
  
}

//in1to10
public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode == true)
  {
    if (n <= 1 || n >= 10)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  if (n >= 1 && n <= 10)
  {
    return true;
  }
  return false;
}

//old35
public boolean old35(int n) {
  if (n % 3 == 0 && n % 5 == 0)
  {
    return false;
  }
  else if (n % 3 == 0 || n % 5 == 0)
  {
    return true;
  }
  else
  {
  return false;
  }
}
