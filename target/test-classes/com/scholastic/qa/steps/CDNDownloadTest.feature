Feature: Download Large File

  Scenario: User downloads file larger than one megabyte
    Given User downloads file from url "http://cdn.education.scholastic.com/slms-static/duke-psi1/s_app_s44jr_media/activi/pawarmup/s44jr_pawarmup_loop_cd.mp3"
    Then the user should see how long the download took