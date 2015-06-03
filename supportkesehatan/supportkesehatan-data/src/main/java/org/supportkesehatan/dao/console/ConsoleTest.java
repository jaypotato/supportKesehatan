package org.supportkesehatan.dao.console;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.supportkesehatan.domain.PesertaJaskes;
import org.supportkesehatan.dao.PesertaJaskesDao;
import org.supportkesehatan.dao.PesertaJaskesDao;
import org.supportkesehatan.dao.impl.HibPesertaJaskesDao;

public class ConsoleTest 
{
    public static void main( String[] args ){
    	
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        
        PesertaJaskesDao pesertaDao =  ctx.getBean("pesertaJaskes", PesertaJaskesDao.class);
        System.out.println(new org.joda.time.DateTime());
        PesertaJaskes peserta1 = new PesertaJaskes("iskandar123", "reyhan123" , false , new org.joda.time.DateTime(), new org.joda.time.DateTime());
        //System.out.println(new org.joda.time.DateTime());
        pesertaDao.add(peserta1);
        ctx.close();
        
        List<PesertaJaskes> listPeserta = pesertaDao.list();
        for(PesertaJaskes p : listPeserta){
        	System.out.println(p);
        }
    }
}



