package com.example.lab.Service;

import com.example.lab.Dao.FeedbackDao;
import com.example.lab.Entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ExportExcelSerivce {
    @Autowired
    private FeedbackDao feedbackDao;

    // 导出所有数据
    public void exportExcel(){
        Feedback feedback = feedbackDao.get();
    }


}
