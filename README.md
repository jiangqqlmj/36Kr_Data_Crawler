# 36Kr_Data_Crawler
36Kr网站数据爬虫抓取工具，采用Jsoup，主要抓取了网站首页广告轮播，文章分类标签，分类列表数据以及文章详情和作者相关信息

本人CSDN博文地址<a href="http://blog.csdn.net/developer_jiangqq">http://blog.csdn.net/developer_jiangqq</a></br>
###使用方法
####01.首页广告轮播数据抓取使用方法
```
     Document document = Jsoup.connect(Config.CRAWLER_URL).timeout(100000).get();
		 List<AdHeadBean> adHeadBeans=new HeadDataManager().getHeadBeans_CNK(document);
		 Gson gson=new Gson();
		 System.out.println(gson.toJson(adHeadBeans));
```
####02.首页文章分类标签Tab数据抓取使用方法
```
   Document document = Jsoup.connect(Config.CRAWLER_URL).timeout(100000).get();  
   List<CategoriesBean> categoriesBeans=new CategoryDataManager().getCategoriesBeans_CNK(document);
	 Gson	gson=new Gson();
	 System.out.println(gson.toJson(categoriesBeans));
```
####03.文章根据分类标签的列表抓取使用方法
```
   Document document = Jsoup.connect(Config.CRAWLER_URL).timeout(100000).get();  
   List<HomeNewsBean> homeNewsBeans=new HomeNewsDataManager().getHomeNewsBeans_CNK(document);
	 Gson	gson=new Gson();
	 System.out.println(gson.toJson(homeNewsBeans));
```
####04.文章详情数据抓取使用方法
```
    new Gson().toJson(new ArticleDataManager(CTextUtils.getArticleId("http://36kr.com/p/5040442.html")).getArticleBean(Jsoup.connect("http://36kr.com/p/5040442.html").timeout(100000).get()))
```

###本人录制的其他视频
1.Android Annotations注入框架视频:http://www.cniao5.com/course/10074</br>

###<a href="http://blog.csdn.net/developer_jiangqq">关于本人</a>
邮箱:jiangqqlmj@163.com</br>
本人微信/QQ:781931404</br>
Android技术交流群:99787482</br>
<img src="http://img.blog.csdn.net/20151121085753187"/></br>
Android开发群1:107086751</br>
Android开发群3:109244103</br>
