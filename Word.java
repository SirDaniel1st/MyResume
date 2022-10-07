import java.util.TreeSet;

public class Word implements Comparable<Word>{
    private String word;
    private TreeSet<Word> synonyms;

    public Word(String value) {
        this.word = value;
        synonyms=new TreeSet<Word>();
    }

    public void addSynonyms(Word words){
        this.synonyms.add(words);

    }

    public String getWord(){
        return word;
    }

    public String getSynonyms(){
        String result = " ";
        int i=0;
        for (Word element : synonyms) {
            if (i>0){
                result=result+", ";
            }
            result=result+element.getWord();
            i++;
        }
        return result;
    }

    @Override
    public int compareTo(Word w) {
        if(word==null) return -1;
        if(w==null || w.word==null) return 1;
        return word.compareTo(w.word);
    }

    
}
