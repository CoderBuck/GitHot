package me.buck.githot.bean;

import java.util.List;

/**
 * Created by gwf on 2019/6/26
 */
public class Repo {
    /**
     * author : kefranabg
     * name : readme-md-generator
     * avatar : https://github.com/kefranabg.png
     * url : https://github.com/kefranabg/readme-md-generator
     * description : 📄 CLI that generates beautiful README.md files
     * language : JavaScript
     * languageColor : #f1e05a
     * stars : 4341
     * forks : 163
     * currentPeriodStars : 1353
     * builtBy : [{"username":"kefranabg","href":"https://github.com/kefranabg","avatar":"https://avatars0.githubusercontent.com/u/9840435"},{"username":"NikxDa","href":"https://github.com/NikxDa","avatar":"https://avatars0.githubusercontent.com/u/3141005"},{"username":"yannbertrand","href":"https://github.com/yannbertrand","avatar":"https://avatars0.githubusercontent.com/u/5855339"},{"username":"apatrascu","href":"https://github.com/apatrascu","avatar":"https://avatars3.githubusercontent.com/u/1193770"}]
     */

    private String          author;
    private String          name;
    private String          avatar;
    private String          url;
    private String          description;
    private String          language;
    private String          languageColor;
    private int             stars;
    private int             forks;
    private int             currentPeriodStars;
    private List<BuiltUser> builtBy;

    public String getAuthor()                                 { return author;}

    public void setAuthor(String author)                      { this.author = author;}

    public String getName()                                   { return name;}

    public void setName(String name)                          { this.name = name;}

    public String getAvatar()                                 { return avatar;}

    public void setAvatar(String avatar)                      { this.avatar = avatar;}

    public String getUrl()                                    { return url;}

    public void setUrl(String url)                            { this.url = url;}

    public String getDescription()                            { return description;}

    public void setDescription(String description)            { this.description = description;}

    public String getLanguage()                               { return language;}

    public void setLanguage(String language)                  { this.language = language;}

    public String getLanguageColor()                          { return languageColor;}

    public void setLanguageColor(String languageColor)        { this.languageColor = languageColor;}

    public int getStars()                                     { return stars;}

    public void setStars(int stars)                           { this.stars = stars;}

    public int getForks()                                     { return forks;}

    public void setForks(int forks)                           { this.forks = forks;}

    public int getCurrentPeriodStars()                        { return currentPeriodStars;}

    public void setCurrentPeriodStars(int currentPeriodStars) { this.currentPeriodStars = currentPeriodStars;}

    public List<BuiltUser> getBuiltBy()                       { return builtBy;}

    public void setBuiltBy(List<BuiltUser> builtBy)           { this.builtBy = builtBy;}

    public static class BuiltUser {
        /**
         * username : kefranabg
         * href : https://github.com/kefranabg
         * avatar : https://avatars0.githubusercontent.com/u/9840435
         */

        private String username;
        private String href;
        private String avatar;

        public String getUsername()              { return username;}

        public void setUsername(String username) { this.username = username;}

        public String getHref()                  { return href;}

        public void setHref(String href)         { this.href = href;}

        public String getAvatar()                { return avatar;}

        public void setAvatar(String avatar)     { this.avatar = avatar;}
    }
}
