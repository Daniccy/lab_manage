package com.example.lab.Controller;

import com.example.lab.Entity.Feedback;
import com.example.lab.Service.ExportExcelSerivce;
import com.example.lab.common.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Controller("ExportExcelController")

public class ExportExcelController {
    @Autowired
    private ExportExcelSerivce serivce;
	// 导出工单
    public Ret export() throws IOException {
        String msg = serivce.exportExcel();
        return new Ret("路径位于：" + msg, null);
    }

    /**
     * 反馈列表
     * @return
     */
    public Ret feedbackList(){
        return new Ret("success", serivce.getExcel());
    }
}
