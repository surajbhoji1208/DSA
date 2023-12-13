package hashTable;

public class main {
    public static void main(String[] args) {
        HashTable hash = new HashTable();
        hash.set("nails",100);
        hash.set("tile", 50);
        hash.set("lumber",80);

        hash.set("bolts",200);
        hash.set("screws",140);
        hash.printTable();

        //get method
        System.out.println("get==>"+hash.get("bolts"));

        //get all key methode
        System.out.println("get all keys==>"+ hash.keys());
    }
}
