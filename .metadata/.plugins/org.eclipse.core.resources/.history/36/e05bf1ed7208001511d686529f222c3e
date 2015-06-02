package org.supportkesehatan.console;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import org.supportkesehatan.domain.PesertaJaskes;
import org.supportkesehatan.dao.PesertaDao;

public class ConsoleTest 
{
    public static void main( String[] args ){
    	
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:datasource.xml");
        ctx.refresh();
        
        PesertaDao pesertaDao =  ctx.getBean("pesertaJaskes", PesertaDao.class);
        
        PesertaJaskes peserta1 = new PesertaJaskes("vijay", "jl.memet sastrawirya 43-45");
        
        pesertaDao.add(peserta1);
        
        List<PesertaJaskes> listPeserta = pesertaDao.list();
        for(PesertaJaskes p : listPeserta){
        	System.out.println(p);
        }
    }
}



