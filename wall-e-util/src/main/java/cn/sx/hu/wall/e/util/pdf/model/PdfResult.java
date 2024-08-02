package cn.sx.hu.wall.e.util.pdf.model;

import java.util.List;

/**
 * Pdf处理结果
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class PdfResult {

    private boolean success;

    private List<String> imageFiles;

    private long totalPage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<String> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

}
