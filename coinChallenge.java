package coinchallenge;

public class CoinChallenge {

    public static void main(String[] args) {

        int[] coins = {1,2};
        int totalAmount = 4;
        
        //a 0 azt jelenti, hogy a coins 0. elemét adjuk át (azaz az 1-est)
        System.out.println(calculateCombo(coins, totalAmount, 0));
        
    }
    
    public static int calculateCombo(int[] coins, int amount, int currentIndex) {
      
        //ez a lefutás sikeres volt, a return 1-el jelezzük, hogy ez az ág COMBO 
        if (amount == 0) {
            return 1;
        }
        
         //ez a lefutás NEM volt sikeres volt, a return 0-val jelezzük
        if (amount < 0) {
            return 0;
        }
        
        //itt pedig lefuttatjuk a lehetséges COMBO-kat
        //azt nézzük meg, hogy az amount értékéből milyen coin értékeket lehet levonni
        int combos = 0; // ez tárolja el a visszatért 1-eseket, azaz a sikeres kombinációkat
    
        for (int i = currentIndex; i < coins.length; i++) {
            
            //itt hívjuk meg saját magát, a calculateCombo-t, ahol az amount-coins aktuális értékével számolunk
            combos += calculateCombo(coins, amount - coins[i], i);
			
		
						
     
        }
        return combos;
    }
    
}