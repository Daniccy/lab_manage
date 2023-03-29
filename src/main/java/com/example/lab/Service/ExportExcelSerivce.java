package com.example.lab.Service;

import com.alibaba.excel.EasyExcel;
import com.example.lab.Dao.FeedbackDao;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service

public class ExportExcelSerivce {
    @Autowired
    private FeedbackDao feedbackDao;

    // 导出所有数据
    public String exportExcel() throws IOException {
        List<Feedback> feedbackList = feedbackDao.get();
        StringBuilder urlBuilder = new StringBuilder("C:\\LAB\\");
        urlBuilder.append(System.currentTimeMillis()).append("FeedBack.xlsx");
        String url = String.valueOf(urlBuilder);
        File file = new File(url);
        File fileParent = file.getParentFile();
        if(!fileParent.exists()){
            fileParent.mkdirs();
        }
        file.createNewFile();
        EasyExcel.write(url, Feedback.class).sheet("sheet").doWrite(feedbackList);
        return url;
    }

    public List<Feedback> getExcel(){
        return feedbackDao.get();
    }

    public Feedback getById(int id){
        return feedbackDao.getById(id);
    }

}
