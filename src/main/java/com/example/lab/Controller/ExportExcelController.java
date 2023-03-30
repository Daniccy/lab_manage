package com.example.lab.Controller;

import com.example.lab.Entity.Feedback;
import com.example.lab.Service.ExportExcelSerivce;
import com.example.lab.Util.RetUtil;
import com.example.lab.common.Ret;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Controller("ExportExcelController")

public class ExportExcelController {

    private final static Logger logger = LoggerFactory.getLogger(ExportExcelController.class);

    @Autowired
    private ExportExcelSerivce serivce;
	// 导出工单
    public Ret<?> export() throws IOException {
        String msg = serivce.exportExcel();
        return RetUtil.successWithMsg("path in " + msg);
    }

    /**
     * 反馈列表
     * @return
     */
    public Ret<?> feedbackList(){
        return RetUtil.success(serivce.getExcel());
    }
}
