package net.seninp.gi.rulepruner;

import java.util.ArrayList;
import java.util.List;
import net.seninp.gi.GIAlgorithm;
import net.seninp.jmotif.sax.NumerosityReductionStrategy;
import com.beust.jcommander.Parameter;

/**
 * Parameters accepted by the bitmap printer and their default values.
 * 
 * @author psenin
 * 
 */
public class RulePrunerParameters {

  // general setup
  //
  @Parameter
  public List<String> parameters = new ArrayList<String>();

  // dataset
  //
  @Parameter(names = { "--data", "-d" }, description = "The input file name")
  public static String IN_FILE;

  // output
  //
  @Parameter(names = { "--out", "-o" }, description = "The output file name")
  public static String OUT_FILE;

  // discretization parameters
  //
  @Parameter(names = "--strategy", description = "SAX numerosity reduction strategy")
  public static NumerosityReductionStrategy SAX_NR_STRATEGY = NumerosityReductionStrategy.EXACT;

  @Parameter(names = "--threshold", description = "SAX normalization threshold")
  public static double SAX_NORM_THRESHOLD = 0.01;

  // GI parameter
  //
  @Parameter(names = { "--algorithm", "-a" }, description = "algorithm to use")
  public static GIAlgorithm GI_ALGORITHM_IMPLEMENTATION = GIAlgorithm.SEQUITUR;

  // sub-sampling parameter
  //
  @Parameter(names = { "--subsample" }, description = "subsampling % for longer time series")
  public static double SUBSAMPLING_PERCENTAGE = 0.1;

  // grid boundaries for discretization parameters
  //
  @Parameter(names = { "--bounds", "-b" }, description = "grid boundaries (Wmin Wmax Wstep Pmin Pmax Pstep Amin Amax Astep)")
  public static String GRID_BOUNDARIES = "10 100 10 10 50 10 2 12 2";

}