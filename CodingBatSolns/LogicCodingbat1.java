//cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) 
{
  if (isWeekend == true)
  {
    if (cigars > 39)
    {
      return true;
    }
    return false;
  }
  
  if (isWeekend == false)
  {
    if (cigars > 39)
    {
      if (cigars < 61)
      {
        return true;
      }
      return false;
    }
  }
return false;
}

//dateFashion
public int dateFashion(int you, int date) 
{
  
  if (you < 3)
  {
    return 0;
  }
  else if (date < 3)
  {
    return 0;
  }
  
  if (you > 7)
  {
    return 2;
  }
  if (date > 7)
  {
    return 2;
  }
  else
  {
    return 1;
  }
}

//squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) 
{
  if (isSummer == true)
  {
    if (temp>59)
    {
      if (temp<101)
      {
        return true;
      }
    }
    return false;
  }
  
  
  else 
  {
    if (temp>59)
    {
      if (temp<91)
      {
        return true;
      }
    }
    return false;
  }
}

//caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday)
{
  if (isBirthday == false)
  {
    if (speed<81)
    {
      if (speed<61)
      {
        return 0;
      }
    return 1;
    }
  else if (speed>81)
  {
    return 2;
  }
  }
  else
  {
    if (speed<86)
    {
      if (speed<66)
      {
        return 0;
      }
    return 1;
    }
    else if (speed>86)
    {
      return 2;
    }
  }
//exists soley because of negative numbers
return 1000000;
}


//sortaSum
public int sortaSum(int a, int b) {
  if (a+b >9)
  {
    if (a+b<20)
    {
      return 20;
    }
  }
  if (a+b<10)
  {
    return a+b;
  }
  if (a+b>20)
  {
    return a+b;
  }
  else
  {
    return a+b;
  }
}
