package JavaDay_16Feb_Enum;

enum APIURLS{
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIURLS(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
