import java.util.TreeSet;

public class Thesuarus {
    public static void main(String[] args) {
        TreeSet<Word> allWs = new TreeSet<Word>();
        String [] worrds = new String[2];
        worrds[0] = "class";
        worrds[1] = "object";

        String [] syn = new String[4];
        syn[0] = "breed";
        syn[1] = "category";
        syn[2] = "article";
        syn[3] = "body";
        int i=0;



        for(String wds:worrds){
            Word word = new Word(wds);
            Word synonym1 = new Word(syn[i]);
            Word synonym2 = new Word(syn[i+1]);

            if (allWs.contains(word)) {
                allWs.tailSet(word).first().addSynonyms(synonym1); //find the word in the set
                allWs.tailSet(word).first().addSynonyms(synonym2);
            } 
            else {
                word.addSynonyms(synonym1);
                word.addSynonyms(synonym2);
                allWs.add(word);
            }   
            i=i+2;

        }

        allWs.forEach( element -> {
            System.out.println(element.getWord()+":" +element.getSynonyms());
        });
    }
}