class Solution {
    public int subtractProductAndSum(int n) {
        int tempMul=1, tempAdd=0;
        String input = String.valueOf(n);
        int length = input.length();
        for(int i=0;i<length;i++){
            char val = input.charAt(i);
            tempMul = tempMul* Character.getNumericValue(val);
        }
        for(int i=0;i<length;i++){
            char val2 = input.charAt(i);
            tempAdd = tempAdd+ Character.getNumericValue(val2);
        }
        return (tempMul-tempAdd);
    }
}
