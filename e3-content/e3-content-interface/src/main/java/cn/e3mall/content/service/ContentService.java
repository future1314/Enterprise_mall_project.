package cn.e3mall.content.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbContent;

public interface ContentService {
	// 新增内容方法
	E3Result addContent(TbContent content);

	// 更新内容方法
	E3Result updateContent(TbContent content);

	// 内容管理列表查询
	EasyUIDataGridResult getContentList(long categoryId, int page, int rows);

	//删除内容
	E3Result deleteContent(@RequestParam("ids") long[] contentId);

	List<TbContent> getContentListByCid(long cid);
}
