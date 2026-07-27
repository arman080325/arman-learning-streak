# newday.ps1 - Morning: creates today's log + daily-slides folder
$today = Get-Date -Format "yyyy-MM-dd"
$target = "daily-logs/$today.md"
$slidesFolder = "daily-slides/$today"

if (Test-Path $target) {
    Write-Host "Today's log already exists: $target" -ForegroundColor Yellow
}
else {
    cp TEMPLATE.md $target
    Write-Host "Created: $target - Now go fill it." -ForegroundColor Green
}

if (Test-Path $slidesFolder) {
    Write-Host "Today's slides folder already exists: $slidesFolder" -ForegroundColor Yellow
}
else {
    New-Item -ItemType Directory -Path $slidesFolder | Out-Null
    Write-Host "Created: $slidesFolder" -ForegroundColor Green
}