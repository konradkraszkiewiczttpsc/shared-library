def call(Map config = [:]) {
    bat """
    robocopy C:\\Users\\Admin\\Desktop\\robocopy\\source C:\\Users\\Admin\\Desktop\\robocopy\\target /MT /MIR"
    IF ERRORLEVEL 1 (echo ROBOCOPY STATUS = OK) ELSE (echo ROBOCOPY STATUS = FAILURE)
    exit /B 0
    """
}