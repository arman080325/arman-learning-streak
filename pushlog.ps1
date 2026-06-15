# pushlog.ps1 - Night: commits and pushes today's log



$today = Get-Date -Format "yyyy-MM-dd"

git add .
git commit -m "log: $today"
git push

Write-Host "Day $today locked in. Sleep well." -ForegroundColor Cyan

