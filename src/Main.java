import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Comparator for comparing each object in heap
        Comparator<Company> minSizeComparator = Comparator.comparingInt(Company::getSize);
        PriorityQueue<Company> comp = new PriorityQueue<>(minSizeComparator);
        comp.add(new Company("Disney", 4000));
        //add new company object inside of priorityQueue
        //do not have to create company objects separately
        comp.add(new Company("Google", 3000));
        comp.add(new Company("Apple", 5000));
        comp.add(new Company("Amazon", 9000));
        comp.add(new Company("Meta", 1000));
        comp.add(new Company("Motorola", 7000));
        comp.add(new Company("Microsoft", 8000));
        comp.add(new Company("Walmart", 6000));

        //System.out.println(comp);
        //System.out.println(comp.poll());

        while (comp.size() >= 2){
            System.out.println(comp.size());
            Company firstSmallest = comp.poll();
            Company secondSmallest = comp.poll();
            String mergedName = firstSmallest.name + "-" + secondSmallest.name;
            int mergedSize = (int)((firstSmallest.size + secondSmallest.size) * 1.1);
            Company mergedCompany = new Company(mergedName, mergedSize);
            comp.add(mergedCompany);

            System.out.println("Merged " + firstSmallest + " and " + secondSmallest +
                            " into " + mergedName + " with size " + mergedSize);
        }
        System.out.println(comp.size());
        System.out.println(comp.toString());




    }
}
