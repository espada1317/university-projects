public class CategoriesClass {
    private int id;
    private String name;
    private int itemsCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    @Override
    public String toString() {
        return "Category { id = " + id + ", name = " + name + ", itemsCount = " + itemsCount + " }";
    }
}