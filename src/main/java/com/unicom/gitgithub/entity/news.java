package com.unicom.gitgithub.entity;

public class news
{
    private Integer id;
    private String title;
    private String content;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public news(Integer id, String title, String content)
    {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "news{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}
