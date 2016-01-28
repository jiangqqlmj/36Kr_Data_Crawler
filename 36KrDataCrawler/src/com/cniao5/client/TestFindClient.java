package com.cniao5.client;

import java.util.List;

import com.cniao5.app36kr.entity.RecentNewsBean;
import com.cniao5.biz.RecentDataManager;
import com.cniao5.entity.FindAdData;
import com.cniao5.utils.HttpRequest;
import com.google.gson.Gson;

public class TestFindClient {
	public static void main(String[] args) {
		//测试发现顶部广告数据
        String adReString=HttpRequest.sendGet("https://z.36kr.com/api/p/sc/images", "type=1");
        Gson gson=new Gson();
        FindAdData adData= gson.fromJson(adReString, FindAdData.class);
        System.out.println(adData);   
        //测试近期获取数据
        String recentRes=HttpRequest.sendGet("http://chuang.36kr.com/api/actapply", "pageSize=95");
        List<RecentNewsBean> recentNewsBeans=new RecentDataManager().getRecentDatas(recentRes);
        System.out.println(recentNewsBeans);
	}
}
