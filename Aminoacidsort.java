import java.util.Arrays;
public class Aminoacidsort{

     public static void main(String []args){
        String[] aminoacid = {"Alanine","Cysteine"," Aspartic acid"," Glutamic acid"," Phenylalanine"," Glycine ","Histidine"," Isoleucine"," Lysine"," Leucine"," Methionine"," Asparagine"," Proline"," Glutamine"," Arginine"," Serine"," Threonine ","Valine ","Tryptophan"," Tyrosine"};
        Arrays.sort(aminoacid);
        for(int i = 0; i < aminoacid.length; i++){
         System.out.println(aminoacid[i]);
     }}
}
