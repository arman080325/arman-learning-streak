# pushlog.ps1 - Night: commits and pushes today's log

git pull --rebase origin main

$today = Get-Date -Format "yyyy-MM-dd"

git add .
git commit -m "log: $today"
git push

Write-Host "Day $today locked in. Sleep well." -ForegroundColor Cyan

