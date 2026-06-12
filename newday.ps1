# newday.ps1 — Morning: creates today's log
$today = Get-Date -Format "yyyy-MM-dd"
$target = "daily-logs/$today.md"

if (Test-Path $target) {
    Write-Host "Today's log already exists: $target" -ForegroundColor Yellow
}
else {
    cp TEMPLATE.md $target
    Write-Host "✅ Created: $target — Now go fill it." -ForegroundColor Green
}