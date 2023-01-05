package com.github.liuyueyi.forum.service.article.service;

import com.github.liueyueyi.forum.api.model.enums.OperateArticleEnum;
import com.github.liueyueyi.forum.api.model.vo.PageParam;
import com.github.liueyueyi.forum.api.model.vo.PageVo;
import com.github.liueyueyi.forum.api.model.vo.article.ArticlePostReq;
import com.github.liueyueyi.forum.api.model.vo.article.dto.ArticleDTO;

/**
 * 文章后台接口
 *
 * @author louzai
 * @date 2022-09-19
 */
public interface ArticleSettingService {

    /**
     * 更新文章
     *
     * @param req
     */
    void updateArticle(ArticlePostReq req);

    /**
     * 获取文章总数
     *
     * @return
     */
    Integer getArticleCount();

    /**
     * 获取文章列表
     *
     * @param pageParam
     * @return
     */
    PageVo<ArticleDTO> getArticleList(PageParam pageParam);

    /**
     * 删除文章
     *
     * @param articleId
     */
    void deleteArticle(Long articleId);


    /**
     * 操作文章
     *
     * @param articleId
     * @param operate
     */
    void operateArticle(Long articleId, OperateArticleEnum operate);
}
