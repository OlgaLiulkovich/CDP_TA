package pages.MyLibrary.NewWork;

/**
 * Created by Olga_Liulkovich on 4/13/2018.
 */
public class NewWorkData {
    private String title;
    private String author;
    private String publisher;
    private String workSize;
    private String year;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getWorkSize() {
        return workSize;
    }

    public String getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setWorkSize(String workSize) {
        this.workSize = workSize;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static NewWorkData create (
            String title,
            String author,
            String publisher,
            String workSize,
            String year
    ){
        NewWorkData data = new NewWorkData();
        data.setTitle(title);
        data.setAuthor(author);
        data.setPublisher(publisher);
        data.setWorkSize(workSize);
        data.setYear(year);
        return data;
    }

}
