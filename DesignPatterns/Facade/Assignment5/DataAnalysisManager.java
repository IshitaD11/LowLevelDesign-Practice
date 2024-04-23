package LowLevelDesign.DesignPatterns.Facade.Assignment5;

import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.AnalysisResult;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.AnalysisAlgorithmConfig;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.DataCollectionParams;
// import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.DataCollectionResult;
// import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.PreprocessedData;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.models.PreprocessingOptions;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.services.AnalysisAlgorithmService;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.services.DataCollectionService;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.services.DataPreprocessingService;
import LowLevelDesign.DesignPatterns.Facade.Assignment5.services.VisualizationService;

public class DataAnalysisManager {
    
    // code without Facade
    // private DataCollectionService dataCollectionService;
    // private DataPreprocessingService dataPreprocessingService;
    // private AnalysisAlgorithmService analysisAlgorithmService;
    // private VisualizationService visualizationService;

    // public DataAnalysisManager(DataCollectionService dataCollectionService,
    //                            DataPreprocessingService dataPreprocessingService,
    //                            AnalysisAlgorithmService analysisAlgorithmService,
    //                            VisualizationService visualizationService) {
    //     this.dataCollectionService = dataCollectionService;
    //     this.dataPreprocessingService = dataPreprocessingService;
    //     this.analysisAlgorithmService = analysisAlgorithmService;
    //     this.visualizationService = visualizationService;
    // }

    // public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
    //                                           PreprocessingOptions preprocessingOptions,
    //                                           AnalysisAlgorithmConfig algorithmConfig) {
    //     // Step 1: Collect data
    //     DataCollectionResult collectionResult = dataCollectionService.collectData(collectionParams);

    //     // Step 2: Preprocess data
    //     PreprocessedData preprocessedData = dataPreprocessingService.preprocessData(collectionResult.getData(), preprocessingOptions);

    //     // Step 3: Apply analysis algorithms
    //     AnalysisResult analysisResult = analysisAlgorithmService.applyAnalysisAlgorithms(preprocessedData, algorithmConfig);

    //     // Step 4: Visualize results
    //     visualizationService.visualizeResults(analysisResult);

    //     return analysisResult;
    // }

    // code with facade

    DataAnalysisFacade dataAnalysisFacade;

    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService){
            
            dataAnalysisFacade = new DataAnalysisFacade(dataCollectionService,
                                dataPreprocessingService, 
                                analysisAlgorithmService, 
                                visualizationService);
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {

        return dataAnalysisFacade.performFullAnalysis(collectionParams, preprocessingOptions, algorithmConfig);
    }
}
