public class _134_Gas_Station_OR_Petrol_Ki_Problem{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        /*Similar to Petrol ki Problem from CodeChef 
          Here i will take another method other than used in Codechef

          In CodeChef --->>
          1. Alice and Bob was there 
          2. So maine 4 cheeze toh same calculate kari 
              int Total_Gas=0;
              int Total_Cost=0;
              int currentGas=0;
              int StartingPoint=0;
          3. Base Condition mai agar total cost > total gas available
             toh fir yeh imposssible hai ki hum kabhi poch paaye kisi
             na kisi point pe petrol ki kami ho hi jayegi return -1
          4. Then maine harr ek point pe currentPetrol check kia
            if voh negative hota toh mai starting point badha dungi
            aur currentPetrol ko reset to 0 kar dungi.
          5.After 1 pass to size n
            if starting point is <n then return  StartingPoint 
            if not then return -1     
  
              *****************************************

          Here, In LeetCode
          1. Extra variable :-  int CumulativeDeficit=0;
          2. Yeh Calculate karega ki last mai pochte pochte humein kitni 
             kami hogi total milake
          3. Iss kami ko hum Current available Petrol se compare karwaayenge 
          4. if kami jyada hai aur humare paas kamm hai toh -1 return krdena
          5. baaki process as similar to above process hai .

        */
       
        int currentGas=0;
        int StartingPoint=0;
        int CumulativeDeficit=0;
       
       for(int i=0;i<gas.length;i++)
       {
        
        currentGas+=gas[i]-cost[i];
        if(currentGas<0)
        {
            CumulativeDeficit+=currentGas;
            currentGas=0;
            StartingPoint=i+1;
        }
       }
      if(CumulativeDeficit+currentGas>=0)
      {
        return StartingPoint;
      }
      return -1;
    }
}