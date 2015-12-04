package com.cniao5.client;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.cniao5.biz.ArticleDataManager;
import com.cniao5.biz.CategoryDataManager;
import com.cniao5.biz.HeadDataManager;
import com.cniao5.biz.HomeNewsDataManager;
import com.cniao5.entity.AdHeadBean;
import com.cniao5.entity.CategoriesBean;
import com.cniao5.entity.HomeNewsBean;
import com.cniao5.utils.CTextUtils;
import com.cniao5.utils.URLAvailability;
import com.google.gson.Gson;

/**
 * 抓取功能测试
 * @author jiangqq
 *
 */
public class TestClient {
 public static void main(String[] args) {
	try {
//		 Document document = Jsoup.connect("http://36kr.com").timeout(100000).get();
//		 List<AdHeadBean> adHeadBeans=new HeadDataManager().getHeadBeans(document);
//		 Gson gson=new Gson();
//		 System.out.println(gson.toJson(adHeadBeans));
//		 List<CategoriesBean> categoriesBeans=new CategoryDataManager().getCategoriesBeans(document);
//		 gson=new Gson();
//		 System.out.println(gson.toJson(categoriesBeans));
//		 List<HomeNewsBean> homeNewsBeans=new HomeNewsDataManager().getHomeNewsBeans(document);
//		 gson=new Gson();
//		 System.out.println(gson.toJson(homeNewsBeans));
		 String mURL="http://36kr.com/p/5040517.html";
	     System.out.println(new Gson().toJson(new ArticleDataManager(CTextUtils.getArticleId(mURL)).getArticleBean(Jsoup.connect(mURL).timeout(100000).get())));
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
}
