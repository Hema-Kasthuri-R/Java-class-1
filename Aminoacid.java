public class Aminoacid{

     public static void main(String []args){
        String[] aminoacid = {"Alanine","Cysteine"," Aspartic acid"," Glutamic acid"," Phenylalanine"," Glycine ","Histidine"," Isoleucine"," Lysine"," Leucine"," Methionine"," Asparagine"," Proline"," Glutamine"," Arginine"," Serine"," Threonine ","Valine ","Tryptophan"," Tyrosine"};
        int[] molw = {71,103,114,128,147,57,137,113,129,113,131,114,97,128,157,87,101,99,186,163};
        System.out.println("Aminoacid\tMolecular weight");
        for (int i=0; i<aminoacid.length;i++)
        {
        
        System.out.println(aminoacid[i] + "\t" + molw[i]);
     }
         System.out.println("Total number of Aminoacid: " + aminoacid.length);
     }
}
