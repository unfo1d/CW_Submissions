//Task 1: cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) 
{
if (cigars >= 40)
  {
      if (cigars <= 60)
     {
        if (isWeekend = false)
        {
          return true;
        }
     }
  }
  else 
  {
    return false;
  }
}

//Task 2: dateFashion

public int dateFashion(int you, int date) 
{
  if (you <= 2 || date <=2)
  {
    {
      return 0;
    }
    
  }
 else if (you >= 8 || date >= 8)
    {
      {
        return 2;
      }
    }
  else 
  {
    return 1;
  }
}

// Task 3: squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) 
{
if (isSummer == true)
  { 
    if (temp >= 60 && temp <= 100)
      {
        return true;
      }
    else
    {
      return false;
    }
  }
  else if (temp >= 60 && temp<=90)
  {
     return true;
  }
    return false;
}


// Task 4: caughtSpeeding

public int caughtSpeeding(int speed, boolean isBirthday) 
{

if (isBirthday == true)
{
  if (speed >= 86)
  {
    return 2;
  } 
  else if (speed <= 65)
  {
      return 0;
  }
  return 1;
  
}
  if(speed >= 81)
  {
    return 2;
  }
  else if (speed<=60)
  {
    return 0;
  }
  return 1;  
}

//Task 5: sortaSum

public int sortaSum(int a, int b) {
  if (a + b >= 10 && a+b <= 19)
  {
    return 20;
  }
  else 
  {
    return a+b;
  }
}
