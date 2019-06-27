package me.buck.githot.bean;

/**
 * Created by gwf on 2019/6/26
 */
public class Dev {


    /**
     * username : gcanti
     * type : user
     * url : https://github.com/gcanti
     * avatar : https://avatars3.githubusercontent.com/u/878912
     * repo : {"name":"","description":"","url":"https://github.comundefined"}
     */

    private String   username;
    private String   type;
    private String   url;
    private String   avatar;
    private RepoBean repo;

    public String getUsername()              { return username;}

    public void setUsername(String username) { this.username = username;}

    public String getType()                  { return type;}

    public void setType(String type)         { this.type = type;}

    public String getUrl()                   { return url;}

    public void setUrl(String url)           { this.url = url;}

    public String getAvatar()                { return avatar;}

    public void setAvatar(String avatar)     { this.avatar = avatar;}

    public RepoBean getRepo()                { return repo;}

    public void setRepo(RepoBean repo)       { this.repo = repo;}

    public static class RepoBean {
        /**
         * name :
         * description :
         * url : https://github.comundefined
         */

        private String name;
        private String description;
        private String url;

        public String getName()                        { return name;}

        public void setName(String name)               { this.name = name;}

        public String getDescription()                 { return description;}

        public void setDescription(String description) { this.description = description;}

        public String getUrl()                         { return url;}

        public void setUrl(String url)                 { this.url = url;}
    }
}
