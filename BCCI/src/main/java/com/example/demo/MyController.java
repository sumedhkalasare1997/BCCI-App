package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
@Autowired
MatchesRepo matchesRepo;

@Autowired
SeriesRepo seriesRepo;

//Get the schedule for a specific series.
@RequestMapping("getAllMatches/{sid}")
 public Series getAllMatches(@PathVariable int sid)
{
	try {
	return seriesRepo.findById(sid).get();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Get the schedule for all series.
@RequestMapping("getAllSeries")
public List<Series> getAllSeries()
{
	try {
		return seriesRepo.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Create a schedule for a series.
@RequestMapping("createSeries")
public Series createSeries(@RequestBody Series series)
{
	try {
		return seriesRepo.save(series);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Delete a schedule for a series.
@RequestMapping("deleteSeries/{sid}")
public String deleteSeries(@PathVariable int sid)
{
	try {
		seriesRepo.deleteById(sid);
	
		return "Series Deleted Successfully";
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "not successful";
	}
}

//   Modify a schedule for a series.
@RequestMapping("updateSeries/{sid}")
public Series updateSeries(@PathVariable int sid)
{
	try {
		Series series=seriesRepo.findById(sid).get();
		series.setTeam2("Neitherland");
		seriesRepo.save(series);
		return series;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}

}
