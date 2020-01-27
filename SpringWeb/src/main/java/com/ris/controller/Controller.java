package com.ris.controller;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ris.repository.KategorijeRepository;
import com.ris.repository.KorisnikRepository;
import com.ris.repository.PrijateljiRepository;
import com.ris.repository.ReceptRepository;

import model.Kategorija;
import model.Korisnika;
import model.Omiljenakategorija;
import model.Poruka;
import model.Prijatelji;
import model.Recept;
import model.Sastojak;
import model.Slika;

@org.springframework.stereotype.Controller
@RequestMapping(value="/Kontroler")
public class Controller {
	@Autowired
	KorisnikRepository kr;
	@Autowired 
	KategorijeRepository kgr;
	@Autowired
	ReceptRepository rr;
	@Autowired
	PrijateljiRepository pr;
	
	
	@RequestMapping(value="/prijava", method=RequestMethod.GET)
	public String registracija(HttpServletRequest request,String username,String lozinka) {
		List<Korisnika> lista=kr.findAll();
		Korisnika a=null;
		boolean nasao=false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getImeKorisnika().equals(username)) {
				if(lista.get(i).getSifraKorisnika().equals(lozinka)) {
					nasao=true;
					a=lista.get(i);
				}
			}
		}
		
		if(nasao) {
			request.getSession().setAttribute("korisnik", a);
			return "uspeo";
			
		}
		else
			return "nijeuspeo";
	}
	
	@RequestMapping(value="/prikaziKategorije", method=RequestMethod.GET)
	public String kategorije(HttpServletRequest request) {
		List<Kategorija> lista=kgr.findAll();
		int s=lista.size();
		request.getSession().setAttribute("kategorije", lista);
		request.getSession().setAttribute("brojKategorija", s);
		return "/prva/kategorije";	
	}
	
	@RequestMapping(value="/prikazKa", method=RequestMethod.GET)
	public String prikazRecepataZaKategoriju(String id, HttpServletRequest request) {
		int i=Integer.parseInt(id);
		Kategorija k=kgr.findById(i).get();
		List<Recept> lista=rr.findByKategorija(k);
		request.getSession().setAttribute("receptiK", lista);
		request.getSession().setAttribute("k", k);
		return "prva/prikazRecepataKategorija";
		
	}
	
	@RequestMapping(value="/prikazRe",method=RequestMethod.GET)
	public String prikazOdabranogRecepta(HttpServletRequest requst,String idr) {
		int i=Integer.parseInt(idr);
		Recept r=rr.findById(i).get();
		String kate=r.getKategorija().getImeKategorije();
		String kori=r.getKorisnika().getImeKorisnika();
		List<Sastojak> lista1=r.getSastojaks();
		List<Slika> lista2=r.getSlikas();
		List<Omiljenakategorija> lista3=r.getOmiljenakategorijas();
		requst.getSession().setAttribute("recept", r);
		requst.getSession().setAttribute("kate", kate);
		requst.getSession().setAttribute("kori", kori);
		requst.getSession().setAttribute("lista1", lista1);
		requst.getSession().setAttribute("lista2", lista2);
		requst.getSession().setAttribute("lista3", lista3);
		return "prva/recept";
	}
	
	@RequestMapping(value="/prikaziPrijatelje",method=RequestMethod.GET)
	public String prikaziPrijatelje(HttpServletRequest request, String idk) {
		int i=Integer.parseInt(idk);
		Korisnika k=kr.findById(i).get();
		List<Prijatelji> lista=k.getPrijateljis1();
		int b=lista.size();
		request.getSession().setAttribute("prijatelji", b);	
		return "/cetvrto/prijateljstvo";
	}
	
	@RequestMapping(value="/prikaziPoruke",method=RequestMethod.GET)
	public String prikaziPoruke(HttpServletRequest request, String idk) {
		int i=Integer.parseInt(idk);
		Korisnika k=kr.findById(i).get();
		List<Poruka> lista=k.getPorukas1();
		int b=lista.size();
		request.getSession().setAttribute("poruka", b);	
		return "/cetvrto/prijateljstvo";
	}
	
	@RequestMapping(value="/biranjeKategorije",method=RequestMethod.GET)
	public String biranjeKategorije(HttpServletRequest request, String idk) {
		List<Kategorija> lista=kgr.findAll();
		request.getSession().setAttribute("lista", lista);
		request.getSession().setAttribute("idk", idk);
		return "DodajRecept";
	}
	
	@RequestMapping(value="/dodajGa",method=RequestMethod.POST)
	public String dodajGa(HttpServletRequest request, String imeRecepta,String napomena,Integer idKategorija,String idk) {
		int i=Integer.parseInt(idk);
		Kategorija k=kgr.findById(idKategorija).get();
		Korisnika kk=kr.findById(i).get();
		Recept r=new Recept();
		r.setImeRecepta(imeRecepta);
		r.setNapomena(napomena);
		r.setKategorija(k);
		r.setKorisnika(kk);
		Recept sacuvan=null;
		try {
		sacuvan=rr.save(r);
		}catch(Exception e) {
		}
		request.getSession().setAttribute("recept", sacuvan);
		return "DodajRecept";
	}
	@RequestMapping(value="/dodajPrijatelja",method=RequestMethod.GET)
	public String dodajPrijatelja(HttpServletRequest request, String idk) {
		List<Korisnika> lista=kr.findAll();
		request.getSession().setAttribute("idk", idk);
		request.getSession().setAttribute("lista", lista);
		return "DodajPrijatelja";	
	}
	
	@RequestMapping(value="/dd",method=RequestMethod.POST)
	public String dd(HttpServletRequest request, Integer idPrijatelja) {
		/*Korisnika k=kr.findById(idPrijatelja).get();
		Prijatelji p=new Prijatelji();
		p.setKorisnika1(k);
		Korisnika kk=kr.findById(1).get();
		p.setKorisnika2(kk);
		p.setStatus("prijatelji");
		
		Prijatelji pp=pr.save(p);*/
		return "DodajPrijatelja";
	}
	
	@RequestMapping(value="/prikazatiPoNaslovu",method=RequestMethod.GET)
	public String prikazatiPoNaslovu(HttpServletRequest request,String imeRecepta) {
		Recept r= rr.poNazivu(imeRecepta);
		if(r!=null) {
			request.getSession().setAttribute("recept", r);
			return "prikazatiNaslovRecepta";
		}
		else {
			request.getSession().setAttribute("nema",imeRecepta);
			return "nemaRecepta";
		}
	}	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	@RequestMapping(value="/dodajClana",method=RequestMethod.POST)
	public String dodajClana(HttpServletRequest request,String imeKorisnika,String sifraKorisnika,Date datumR) {
		Korisnika k=new Korisnika();
		k.setDatumR(datumR);
		k.setImeKorisnika(imeKorisnika);
		k.setSifraKorisnika(sifraKorisnika);
		Korisnika kk=null;
		try {
		kk=kr.save(k);
		}catch(Exception e) {
			
		}
		request.getSession().setAttribute("korisnik", kk);
		if(kk!=null) {
			return "dodat";
		}
		return "postaniClan";

	}
	@RequestMapping(value="/prijavaAdmina", method=RequestMethod.GET)
	public String prijavaAdmina(HttpServletRequest request,String username,String lozinka) {
		List<Korisnika> lista=kr.findAll();
		Korisnika a=null;
		boolean nasao=false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getImeKorisnika().equals(username)) {
				if(lista.get(i).getSifraKorisnika().equals(lozinka)) {
					if(lista.get(i).getTipKorisnika().equals("admin")){
					nasao=true;
					a=lista.get(i);
					}
				}
			}
		}
		
		if(nasao) {
			request.getSession().setAttribute("korisnik", a);
			return "uspeoAdmin";
			
		}
		else
			return "nijeuspeo";
	}
	
	@RequestMapping(value="/prikaziStatistiku",method=RequestMethod.GET)
	public String prikaziStatistiku(HttpServletRequest request) {
		List<Korisnika> k=kr.findAll();
		int brojKorisnika=k.size();
		List<Recept> r=rr.findAll();
		int brojRecepata=r.size();
		List<Kategorija> kg=kgr.findAll();
		int brojKategorija=kg.size();
		LocalDate d=LocalDate.now();
		d.toString();
		request.getSession().setAttribute("datum", d);
		request.getSession().setAttribute("brojK", brojKorisnika);
		request.getSession().setAttribute("brojR", brojRecepata);
		request.getSession().setAttribute("brojKG", brojKategorija);
		return "statistika";
	}
	
	@RequestMapping(value="/statistikaZaDatum",method=RequestMethod.GET)
	public String izabranDatum(HttpServletRequest request,Date datum) {
		String d=datum.toString();
		int broj=0;
		List<Recept> l=rr.findAll();
		int duzina=l.size();
		for(int i=0;i<duzina;i++) {
			String d1=l.get(i).getDatumPravljena().toString();
			if(d1.equals(d))
				broj++;	
		}
		request.getSession().setAttribute("broj",broj);
		return "dodatiReceptiDatum";
	}
	
	@RequestMapping(value="/dodajKategoriju",method=RequestMethod.POST)
	public String dodajKategoriju(HttpServletRequest request,String imeKategorije) {
		Kategorija k=new Kategorija();
		k.setImeKategorije(imeKategorije);
		Kategorija kk=null;
		try {
		 kk=kgr.save(k);
		}catch(Exception e) {	
		}
		request.getSession().setAttribute("kategorija", kk);
		return "dodajKategoriju";
		
	}
	@RequestMapping(value="/prikazatiSveRecepte", method=RequestMethod.GET)
	public String sviRecepti(HttpServletRequest request) {
		List<Recept> lista=rr.findAll();
		request.getSession().setAttribute("listaR", lista);
		return "sviRecepti";
	}
}


