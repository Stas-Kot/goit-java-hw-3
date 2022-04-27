class ATM{
public int countBanknotes(int sum) {
  int result = 0;
  int rest = sum;
  int i = 0;
  int[] banknots = {500, 200, 100, 50, 20, 10, 5, 2, 1};
  
  while(i < banknots.length) {
   if(rest>=banknots[i]){
  result += rest/banknots[i];
    rest = rest%banknots[i];
     i++;
  } else {
    i++;
    continue;
  }
  }
    return result;
}
}
