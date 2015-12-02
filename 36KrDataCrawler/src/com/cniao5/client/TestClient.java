package com.cniao5.client;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.cniao5.biz.ArticleDataManager;
import com.cniao5.biz.CategoryDataManager;
import com.cniao5.biz.HeadDataManager;
import com.cniao5.biz.HomeNewsDataManager;
import com.cniao5.common.Config;
import com.cniao5.entity.AdHeadBean;
import com.cniao5.entity.CategoriesBean;
import com.cniao5.entity.HomeNewsBean;
import com.cniao5.utils.CTextUtils;
import com.google.gson.Gson;

/**
 * 抓取功能测试
 * @author jiangqq
 *
 */
public class TestClient {
 public static void main(String[] args) {
	try {
		 Document document = Jsoup.connect(Config.CRAWLER_URL).timeout(100000).get();
		 List<AdHeadBean> adHeadBeans=new HeadDataManager().getHeadBeans_CNK(document);
		 Gson gson=new Gson();
		 System.out.println(gson.toJson(adHeadBeans));
		 List<CategoriesBean> categoriesBeans=new CategoryDataManager().getCategoriesBeans_CNK(document);
		 gson=new Gson();
		 System.out.println(gson.toJson(categoriesBeans));
		 List<HomeNewsBean> homeNewsBeans=new HomeNewsDataManager().getHomeNewsBeans_CNK(document);
		 gson=new Gson();
		 System.out.println(gson.toJson(homeNewsBeans));
		 System.out.println(new Gson().toJson(new ArticleDataManager(CTextUtils.getArticleId("http://36kr.com/p/5040444.html")).getArticleBean_CNK(Jsoup.connect("http://36kr.com/p/5040444.html").timeout(100000).get())));
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
}
