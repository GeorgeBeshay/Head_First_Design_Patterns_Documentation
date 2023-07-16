package Ch08_TheTemplateMethodPattern;

public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name +
                " weights: " + weight;
    }

    public int compareTo(Duck duck){
        return Integer.compare(this.weight, duck.weight);
    }
}
