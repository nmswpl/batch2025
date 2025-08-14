package in.co.nmsworks.week2.day4;

public interface Report {

    void header();
    void body();
    void footer();
    default void generate(){
        header();
        body();
        footer();
    }


}
