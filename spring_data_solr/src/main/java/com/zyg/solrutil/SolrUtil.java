package com.zyg.solrutil;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class SolrUtil {
    @Autowired
    private SolrTemplate solrTemplate;
    /**
     * 将数据库商品导入索引库
     */
    public void importItemData() {
        //通过向数据库查询得到商品信息

       /* TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1");//已审核商品才能导入
        List<TbItem> items = itemMapper.selectByExample(example);*/

       //假数据
        List items = new ArrayList();
        solrTemplate.saveBeans(items);
        solrTemplate.commit();
        System.out.println("===商品数据导入结束===");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");
        SolrUtil solrUtil = (SolrUtil) context.getBean("solrUtil");
        solrUtil.importItemData();
    }


}
